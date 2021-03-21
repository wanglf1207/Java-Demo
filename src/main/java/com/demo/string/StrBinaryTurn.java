package com.demo.string;



public class StrBinaryTurn {
    //��Unicode�ַ���ת����bool������
    public boolean[] StrToBool(String input){
        boolean[] output=Binstr16ToBool(BinstrToBinstr16(StrToBinstr(input)));
        return output;
    }
    //��bool������ת����Unicode�ַ���
    public String BoolToStr(boolean[] input){
        String output=BinstrToStr(Binstr16ToBinstr(BoolToBinstr16(input)));
        return output;
    }
    //���ַ���ת���ɶ������ַ������Կո����
    private String StrToBinstr(String str) {
        char[] strChar=str.toCharArray();
        String result="";
        for(int i=0;i<strChar.length;i++){
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        return result;
    }
    //���������ַ���ת����Unicode�ַ���
    private String BinstrToStr(String binStr) {
        String[] tempStr=StrToStrArray(binStr);
        char[] tempChar=new char[tempStr.length];
        for(int i=0;i<tempStr.length;i++) {
            tempChar[i]=BinstrToChar(tempStr[i]);
        }
        return String.valueOf(tempChar);
    }
    //���������ַ�����ʽ����ȫ16λ���ո��Binstr
    private String BinstrToBinstr16(String input) {
    	
        StringBuffer output = new StringBuffer();
        String[] tempStr = StrToStrArray(input);
        for(int i=0;i<tempStr.length;i++) {
            for(int j=16-tempStr[i].length();j>0;j--)
                output.append('0');
            output.append(tempStr[i]+" ");
        }
        return output.toString();
    }
    
    
    //��ȫ16λ���ո��Binstrת����ȥ0ǰ׺�Ĵ��ո�Binstr
    private String Binstr16ToBinstr(String input){
        StringBuffer output=new StringBuffer();
        String[] tempStr=StrToStrArray(input);
        for(int i=0;i<tempStr.length;i++){
            for(int j=0;j<16;j++){
                if(tempStr[i].charAt(j)=='1'){
                    output.append(tempStr[i].substring(j)+" ");
                    break;
                }
                if(j==15&&tempStr[i].charAt(j)=='0')
                    output.append("0"+" ");
            }
        }
        return output.toString();
    }   
    //�������ִ�ת��Ϊboolean������  ����16λ�пո��Binstr
    private boolean[] Binstr16ToBool(String input){
        String[] tempStr=StrToStrArray(input);
        boolean[] output=new boolean[tempStr.length*16];
        for(int i=0,j=0;i<input.length();i++,j++)
            if(input.charAt(i)=='1')
                output[j]=true;
            else if(input.charAt(i)=='0')
                output[j]=false;
            else
                j--;
        return output;
    }
    //boolean������ת��Ϊ�������ִ�  ���ش�0ǰ׺16λ�пո��Binstr
    private String BoolToBinstr16(boolean[] input){ 
        StringBuffer output=new StringBuffer();
        for(int i=0;i<input.length;i++){
            if(input[i])
                output.append('1');
            else
                output.append('0');
            if((i+1)%16==0)
                output.append(' ');           
        }
        output.append(' ');
        return output.toString();
    }
    //���������ַ���ת��Ϊchar
    private char BinstrToChar(String binStr){
        int[] temp=BinstrToIntArray(binStr);
        int sum=0;   
        for(int i=0; i<temp.length;i++){
            sum +=temp[temp.length-1-i]<<i;
        }   
        return (char)sum;
    }
    //����ʼ�������ַ���ת�����ַ������飬�Կո����
    private String[] StrToStrArray(String str) {
        return str.split(" ");
    }
    //���������ַ���ת����int����
    private int[] BinstrToIntArray(String binStr) {       
        char[] temp=binStr.toCharArray();
        int[] result=new int[temp.length];   
        for(int i=0;i<temp.length;i++) {
            result[i]=temp[i]-48;
        }
        return result;
    }
}

