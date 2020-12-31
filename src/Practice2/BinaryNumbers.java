package Practice2;

public class BinaryNumbers {
    //Функция возвращает байтовый массив, передаваемый на вход, в  виде строки в 16ти-ричном формате
    public String byteToHex(byte[] input) {
        char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[input.length * 2];
        for (int j = 0; j < input.length; j++) {
            int v = input[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }


//    //Функция принимает строку, состоящую из символов используемых для 16ти-ричного формата, и преобразует её в байтовый массив
//    public byte[] hexToByte(String input) {
//
//    }
//
//    //Функция принимает число и возвращает строку, представляющую бинарное представление данного числа
//    public String longToBin(long input) {
//
//    }
//
//    //Функция принимает строку, состоящую из "0" и "1" и возвращает число, соответствующее бинарному представлению, передаваемому в аргументах
//    public long binToLong(String input) {
//
//    }
//
//    //Функция возвращает true, если все биты, позиции которых указаны в bitPositions, выставлены в "1"
//    public boolean isAllBitsSelected(long number, byte[] bitPositions) {
//
//    }
//
//    //Функция возвращает true, если хотя бы один бит из тех позиции которых указаны в bitPositions, выставлен в "1"
//    public boolean isAnyBitSelected(long number, byte[] bitPositions) {
//
//    }
}
