import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Scanner;

public static void main(String[...] args)
{
	System.out.println("¬ведите текст:");
	Scanner input = new Scanner(System.in, "Windows-1251");
	//Scanner sc = new Scanner(System.in, "Windows-1251");
	Logic.printResult ( Logic.formatText (input.nextLine()) );
}
