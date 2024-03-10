public class Customer extends User {
    private List<BillingInformation> billingInformationList;
    private ShoppingCart shoppingCart;

    public void addBillingInformation(BillingInformation billingInformation) {
        billingInformationList.add(billingInformation);
    }
