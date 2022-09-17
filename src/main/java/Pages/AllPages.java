package Pages;

public class AllPages {
    public AllPages(){

    }
    private MainPage mainPage;
    private ProductPage productPage;
    private BasketPage basketPage;

    private AddressPage addressPage;
    private OrdersCheckoutPage ordersCheckoutPage;

    private PaymentPage paymentPage;

    public MainPage mainPage(){
        if (mainPage==null){
            mainPage=new MainPage();
        }
        return mainPage;
    }
    public ProductPage productPage(){

        if (productPage==null){
            productPage=new ProductPage();
        }
        return productPage;
    }

    public BasketPage basketPage(){
        if (basketPage==null){
            basketPage=new BasketPage();
        }
        return basketPage;
    }

    public OrdersCheckoutPage ordersCheckoutPage(){
        if (ordersCheckoutPage==null){
            ordersCheckoutPage=new OrdersCheckoutPage();
        }
        return ordersCheckoutPage;
    }

    public AddressPage addressPage(){
        if (addressPage==null){
            addressPage=new AddressPage();
        }
        return addressPage;
    }
    public PaymentPage paymentPage(){
        if (paymentPage==null){
            paymentPage=new PaymentPage();
        }
        return paymentPage;
    }
}
