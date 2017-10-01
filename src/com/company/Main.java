package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sort(args);
        print(args);
    }

    public static void print(String[] args)
    {
        for(int i=0; i<args.length; i++)
        {
            System.out.println(args[i]);
        }
    }

    public static void sort(String[] args)
    {
        String str;
        for(int i=0; i<args.length; i++)
            for(int j=i+1; j<args.length; j++)
                if(args[i].compareTo(args[j])>0)
                {
                    str=args[j];
                    args[j]=args[i];
                    args[i]=str;
                }

    }

}
