public class BinaryNumber {
    private String binaryNumber;
    private String reversedBinaryNumber;

    public BinaryNumber(){}

    public void convertDecimalToBinary(Integer number, Integer bytesNumber){
        reversedBinaryNumber = "";
        binaryNumber = "";

        //converting to binary
        for(int i = 0 ; i < bytesNumber; i++){
            if(number % 2 == 1){
                reversedBinaryNumber+="1";
            }
            else{
                reversedBinaryNumber+="0";
            }
            number = number/2;

        }
        //reversing to correct order
        for(int i = bytesNumber - 1; i >= 0; i--){
            binaryNumber += reversedBinaryNumber.charAt(i);
        }


    }

    public String getNumberInGreysCode(){

        String output = "";
        String binaryDividedByTwo = divideBinaryByTwo(binaryNumber);
        //XOR
        for(int i = 0 ; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == binaryDividedByTwo.charAt(i)){
                output += "0";
            }
            else {
                output += "1";
            }
        }
        return output;
    }

    private String divideBinaryByTwo(String binaryNumber){
        //every binary number divided by two starts with 0
        String output = "0";

        //i < binaryNumber.length() - 1 because one place is already taken above by 0
        for(int i = 0; i < binaryNumber.length() - 1; i++ ){
            output += binaryNumber.charAt(i);
        }

        return output;
    }

    public String getBinaryNumber(){
        return this.binaryNumber;
    }
}
