public class Ouroboros {
    final static int pos =
0
            ;
    final static String[] body = {
    "public class Ouroboros {",
    "    final static int pos =",
    "0",
    "            ;",
    "    final static String[] body = {",
    "    };",
    "    final static char[] name = {'G','a','b','e',' ','H','u','i','n','k','e','r',' '};",
    "    /* @author Gabe Huinker */",
    "    ",
    "    public static void main (String[] args) throws java.lang.Exception",
    "    {",
    "        int newPos = pos;",
    "        if(pos < 13)",
    "            System.err.print(name[newPos++]);",
    "        else{",
    "            System.err.println();",
    "            newPos = 0;",
    "        }",
    "        for(int i=0; i<5; i++) {",
    "            if (i == 2)",
    "                System.out.println(newPos);",
    "            else",
    "                System.out.println(body[i]);",
    "        }",
    "        for(int i=0; i<body.length; i++)",
    "            System.out.println(body[8] + (char) 34 + body[i] + (char) 34 + ',');",
    "        for(int i=5; i<body.length; i++)",
    "            System.out.println(body[i]);",
    "    }",
    "}",
    };
    final static char[] name = {'G','a','b','e',' ','H','u','i','n','k','e','r',' '};
    /* @author Gabe Huinker */

    public static void main (String[] args) throws java.lang.Exception
    {
        int newPos = pos;
        if(pos < 13)
            System.err.print(name[newPos++]);
        else{
            System.err.println();
            newPos = 0;
        }
        for(int i=0; i<5; i++) {
            if (i == 2)
                System.out.println(newPos);
            else
                System.out.println(body[i]);
        }
        for(int i=0; i<body.length; i++)
            System.out.println(body[8] + (char) 34 + body[i] + (char) 34 + ',');
        for(int i=5; i<body.length; i++)
            System.out.println(body[i]);
    }
}
