public class Main {
    public static void main(String[] args) {

        int number1=10;
        int number2=2;

        int resSum=number1+number2;
        int resDifference=number1-number2;
        int resProduct=number1*number2;
        int resQuotient=number1/number2;

        System.out.println(number1+"+"+number2+"="+resSum);
        System.out.println(number1+"-"+number2+"="+resDifference);
        System.out.println(number1+"*"+number2+"="+resProduct);
        System.out.println(number1+"/"+number2+"="+resQuotient);



        double number3=10.6474;
        double number4=2.65789647;

        double resSumFractional=number3+number4;
        double resDifferenceFractional=number3-number4;
        double resProductFractional=number3*number4;
        double resQuotientFractional=number3/number4;


        System.out.printf("If you add %.2f to %.2f you get %.2f \n",number3,number4, resSumFractional);
        System.out.printf("If you subtract %.2f from %.2f you get %.2f \n",number4,number3, resDifferenceFractional);
        System.out.printf("If you multiply %.2f with %.2f you get %.2f \n",number3,number4, resProductFractional);
        System.out.printf("If you divide %.2f from %.2f you get %.2f \n",number4,number3, resQuotientFractional);


    }
}