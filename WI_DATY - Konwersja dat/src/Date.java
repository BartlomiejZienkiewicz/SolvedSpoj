public class Date {
    String value;

    public Date(String input) {
        this.value = input;
    }
    public String convertToBinary(){
        String year = value.substring(0,4);
        String month = value.substring(5,7);
        String day = value.substring(8,10);

        int integerYear = Integer.parseInt(year);
        int integerMonth = Integer.parseInt(month);
        int integerDay = Integer.parseInt(day);

        if(integerYear < 1980 || integerYear > 2107 || integerMonth < 1 || integerMonth > 12 || integerDay < 1 || integerDay > 31){
            System.out.println("Error");
            return "Error";
        }
        else {
            String binaryYear = (convertNumberToBinary(integerYear - 1980));
            String binaryMonth = (convertNumberToBinary(integerMonth));
            String binaryDay = (convertNumberToBinary(integerDay));

            //preparing binary code to match DOSFAT regulations (binary year - 7chars, binary month -4 chars)
            //(binary day - 5 chars)

            //year
            int howManyZeros = 7 - binaryYear.length();
            for(int i = 0 ; i < howManyZeros; i++){
                binaryYear = '0' + binaryYear;
            }

            //month
            howManyZeros = 4 - binaryMonth.length();
            for(int i = 0 ; i < howManyZeros; i++){
                binaryMonth = '0' + binaryMonth;
            }

            //day
            howManyZeros = 5 - binaryDay.length();
            for(int i = 0 ; i < howManyZeros; i++){
                binaryDay = '0' + binaryDay;
            }
            return binaryYear + binaryMonth + binaryDay;
        }


    }
    private String convertNumberToBinary(int number){
        String output = "";
        String reversedBinaryNumber = "";
        while(number != 0){
            if(number % 2 == 1){
                reversedBinaryNumber += '1';
            }
            else {
                reversedBinaryNumber += '0';
            }
            number = number / 2;
        }
        //reversing to correct order
        for(int i = reversedBinaryNumber.length() - 1; i >= 0; i--){
            output += reversedBinaryNumber.charAt(i);
        }
        return output;
    }


}
