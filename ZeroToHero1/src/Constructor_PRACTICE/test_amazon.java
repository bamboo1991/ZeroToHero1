package Constructor_PRACTICE;

public class test_amazon {
    public static void main(String[] args) {
        Amazon_practice amz1 = new Amazon_practice();
        amz1.navigate("https://www.amazon.com");
        amz1.navigate(Test_data_by_amazon.URL);
        amz1.login(Test_data_by_amazon.username,Test_data_by_amazon.password);
        amz1.search(Test_data_by_amazon.item);

    }
}
