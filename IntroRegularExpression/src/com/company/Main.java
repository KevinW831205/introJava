package com.company;


import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s = "I am a string.";
        System.out.println(s);
        String s2 = s.replaceAll("I", "You");
        System.out.println(s2);


        String alphanumeric = "abcDeeeF1245GhhiiijklabcDeee99z";
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        // ^ checks for the beginning of a string.
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphanumeric.replaceAll("eee99z$", "end"));

        // matches have to match the entire regex
        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println("abcde".matches("^abc"));
        System.out.println("abcde".matches("^abcde"));

        // selecting all characters between []
        System.out.println(alphanumeric.replaceAll("[aei]", "!"));

        //replace aei if followed by F or j
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "!"));

        //instance of [h or H]followed by arry
        System.out.println("name is harry".replaceAll("[Hh]arry", "Harry"));

        //not e or j
        System.out.println(alphanumeric.replaceAll("[^ej]", "!"));

        //replacing multiple short hand form
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "!"));
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "!"));
        System.out.println(alphanumeric.replaceAll("[a-fA-f3-8]", "!"));

        //(?i)ignores case
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "!"));

        //replace all numbers
        System.out.println(alphanumeric.replaceAll("[0-9]", "!"));
        System.out.println(alphanumeric.replaceAll("\\d", "!"));

        //replace all non-digits
        System.out.println(alphanumeric.replaceAll("\\D", "!"));

        //replace all white space
        String whiteSpace = "a   df 3d\t tdgs eerer d   g";
        System.out.println(whiteSpace);
        System.out.println(whiteSpace.replaceAll("\\s", ""));
        System.out.println(whiteSpace.replaceAll("\t", "had tab"));

        //replace all non white space
        System.out.println(whiteSpace.replaceAll("\\S", "!"));

        //replace \\w a-zA-z0-9 and underscore
        System.out.println(alphanumeric.replaceAll("\\w", "!"));
        System.out.println(whiteSpace.replaceAll("\\w", "!"));

        // replace all but \\w
        System.out.println(whiteSpace.replaceAll("\\W", "!"));

        // matches word boundries
        System.out.println(whiteSpace.replaceAll("\\b", "!"));

        //quantifiers specify number of character b4 the {}
        System.out.println(alphanumeric.replaceAll("^abcDe{2}", "!"));
        //+ is any amount of the character
        System.out.println(alphanumeric.replaceAll("^abcDe+", "!"));
        // * replaces whether or not has the
        String someString = "abcDFFF";
        System.out.println(alphanumeric.replaceAll("^abcDe*", "!"));
        System.out.println(someString.replaceAll("^abcDe*", "!"));
        //specifying range of number of a character
        someString = "abcDeeeeeg";
        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}", "!"));
        System.out.println(someString.replaceAll("^abcDe{2,5}", "!"));
        //combinations
        System.out.println(alphanumeric.replaceAll("h+i*j", "!"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>sub-heading</h2>");
        htmlText.append("<p>Some p tag</p>");
        htmlText.append("<p>Some p tag2</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Some p tag3</p>");

//        String h2Pattern = ".*<h2>.*";
        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
//        Pattern pattern = Pattern.compile(h2Pattern,Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

//        String h2GroupPattern = "(<h2>)";
        String h2GroupPattern = "(<h2>.*?</h2>)";   //adding the question mark makes the * lazy
        //       String h2GroupPattern = "(<h2>.+?</h2>)";   //doesn't take empty h2
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        groupMatcher.reset();
        while (groupMatcher.find()) {
            System.out.println("Occurrence " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        //and
        // "ab" -> "a" and "b"

        // Or
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));


        //nots
        String tvTest = "tstvtkt";
//        String tNotVRegEx = "t[^v]";   //t must follow a character to be found
        String tNotVRegEx = "t(?!v)";   //negative look ahead
        Pattern tNotVPattern = Pattern.compile(tNotVRegEx);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        // t(?=v) positive look ahead to find t followed by v

        // usPhoneRegex  "^([\(]{1}[0-9]{3}[\)]{1}[]{1}[0-9]{3}[\-]{1}[0-9]{4})$";
        String phone1 = "1234567890";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";

        System.out.println("phone1 = "+phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = "+phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = "+phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = "+phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

    }
}
