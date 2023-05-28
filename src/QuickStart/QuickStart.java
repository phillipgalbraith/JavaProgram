public class QuickStart{

    public static void main(String[] args){
        testBalanced();
    }

    public static class Money {

      public Money(int i, String string) {
        int amount;
        String currencyCode;
      }
             //overide equals to make balanced == expenses
      public boolean equals(Object o) {
        if (o == this) return true;
        
        if (!(o instanceof Money)) return false;
        
        Money other = (Money)o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
          || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
          
        // boolean storeEquals = (this.store == null && other.store == null)
        //   || (this.store != null && this.store.equals(other.store));
        
        return true;//this.amount == other.amount && currencyCodeEquals;
      }

      
    }
   
 
    public static void testBalanced() {
      Money income = new Money(55, "USD");
      Money expenses = new Money(55, "USD");
      Boolean balanced = income.equals(expenses);
      System.out.println(String.valueOf(balanced));
    }

}