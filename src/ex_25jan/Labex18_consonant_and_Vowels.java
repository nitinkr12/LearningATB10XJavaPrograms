package ex_25jan;

import javax.swing.*;

public class Labex18_consonant_and_Vowels
{
    public static void main(String[] args) {
        {
            //pramod
            String str="pramoD";
            int countOfVowel=0;
            int countOfConsonant=0;


            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u')
                {

                    countOfVowel++;

                }

                else if((str.charAt(i) >= 'a' && str.charAt(i)<='z')||str.charAt(i) >= 'A' && str.charAt(i)<='Z')
                {
                    countOfConsonant++;

                }}
                System.out.println("No of vowels are " + countOfVowel);
                System.out.println("No of consonants are " + countOfConsonant);

            }



        }}


