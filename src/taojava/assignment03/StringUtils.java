package taojava.assignment03;

public class StringUtils
{

  public static String[] splitAt(String inString, char splitChar)
  {
    int splitNum = 0;
    int i;
    for (i = 0; i < inString.length(); i++)
      if (inString.charAt(i) == splitChar)
        {
          splitNum++;
        } // if
    String[] splitString = new String[splitNum + 1];
    int arraySpot = 0;
    String temp = "";
    for (i = 0; i < inString.length(); i++)
      {
        if (inString.charAt(i) == splitChar)
          {
            splitString[arraySpot] = temp;
            temp = "";
            arraySpot++;
          }// if
        else if (i == (inString.length() - 1))
          {
            temp += inString.charAt(i);
            splitString[arraySpot] = temp;
            temp = "";
          }// elif
        else
          {
            temp += inString.charAt(i);
          }// else
      }// for
    if (splitString[splitString.length - 1] == null)
      splitString[splitString.length - 1] = "";
    return splitString;
  }// splitAt()

  public static String[] splitCSV(String inString)
  {
    int i = 0;
    int splitCount = 0;
    int arraySpot = 0;
    String temp = "";
    boolean inQuotes = false;

    // First, we go through it to figure out how big our string array needs to
    // be

    for (i = 0; i < inString.length(); i++)
      {
        if (inString.charAt(i) == '\"' && inString.charAt(i + 1) != '\"')
          {
            inQuotes = !inQuotes;
          }//if
        if (inString.charAt(i) == ',' && inQuotes == false)
          {
            splitCount++;
          }//if
      }//for

    // Then, we go through again and actually figure out the contents of the
    // string array

    String[] splitString = new String[splitCount + 1];
    inQuotes = false;
    for (i = 0; i < inString.length(); i++)
      {
        if (inString.charAt(i) == '\"' && inString.charAt(i + 1) == '\"')
          {
            i++;
            temp += "\"";
          }// elif
        else if (inString.charAt(i) == '\"')
          {
            inQuotes = !inQuotes;
          }// if
        else if (inString.charAt(i) == ',' && inQuotes == false)
          {
            splitString[arraySpot] = temp;
            temp = "";
            arraySpot++;
          }// elif
        else if (i == (inString.length() - 1))
          {
            temp += inString.charAt(i);
            splitString[arraySpot] = temp;
            temp = "";
          }// elif
        else
          {
            temp += inString.charAt(i);
          }// else
      }// while
    return splitString;
  }//splitCSV

  public static String deLeet(String leet)
  {
    String deleeted = "";
    int i;
    for (i = 0; i < leet.length(); i++)
      {
        if (leet.charAt(i) == '@' || leet.charAt(i) == '4')
          deleeted += "a";
        else if (leet.charAt(i) == '|' && leet.charAt(i + 1) == '3')
          {
            deleeted += "b";
            i++;
          }// elif
        else if (leet.charAt(i) == '3')
          deleeted += "e";
        else if (leet.charAt(i) == '1')
          deleeted += "l";
        else if (leet.charAt(i) == '+' || leet.charAt(i) == '7')
          deleeted += "t";
        else if (leet.charAt(i) == '|' && leet.charAt(i + 1) == '\\'
                 && leet.charAt(i) == '|')
          {
            deleeted += "n";
            i += 2;
          }// elif
        else if (leet.charAt(i) == '0')
          deleeted += "o";
        else if (leet.charAt(i) == '5')
          deleeted += "s";
        else
          deleeted += leet.charAt(i);
      }// for
    return deleeted;
  }// deleeted

  public static String nameGame(String name)
  {
    int i = 0;
    String cutName = "";
    if (name.charAt(0) == 'A' || name.charAt(0) == 'E' || name.charAt(0) == 'I'
        || name.charAt(0) == 'O' || name.charAt(0) == 'U')
      {
        cutName = name;
      }// if
    else if ((name.charAt(0) != 'A' && name.charAt(0) != 'E'
              && name.charAt(0) != 'I' && name.charAt(0) != 'O' && name.charAt(0) != 'U')
             && (name.charAt(1) != 'a' && name.charAt(1) != 'e'
                 && name.charAt(1) != 'i' && name.charAt(1) != 'o' && name.charAt(1) != 'u'))
      {
        char[] cutNameArray = new char[name.length() - 2];
        for (i = 2; i < name.length(); i++)
          cutNameArray[i - 2] = name.charAt(i);
        cutName = new String(cutNameArray);
      }// elif
    else
      {
        char[] cutNameArray = new char[name.length() - 1];
        for (i = 1; i < name.length(); i++)
          cutNameArray[i - 1] = name.charAt(i);
        cutName = new String(cutNameArray);
      }// else

    String song = "";
    song += name + "! \n";
    song += name + " " + name + " bo B" + cutName;
    song = song + " Bonana fanna fo F" + cutName + "\n";
    song += "Fee fy mo M" + cutName + " " + name + "! \n";

    return song;
  }// nameGame()

  /**
   * @param args
   */
  public static void main(String[] args)
  {

  }// main

}// StringUtils
