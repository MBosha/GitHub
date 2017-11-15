#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include <string.h>

#define MAX_STRING_LEN 20

int main(){

	system("chcp 1251");

  int a = 0, b = 0, bool = 0, cows = 0, bulls = 0;
  char str1 [MAX_STRING_LEN];
  char str2 [MAX_STRING_LEN];

  //ввод чисел
  while (bool == 0) {

  	printf("\a Введите два числа с одинаковым количеством цифр:\n");
  	scanf("%s %s", &str1, &str2);
   	if ( (strlen(str1) == strlen(str2)) & dec (str1) & dec (str2) ) {
  		bool = 1;
  	}
  }

  //вывод введенных чисел
	printf("Введены числа:\n Число №1 \t%s\n Число №2 \t%s\n", str1, str2);

	//проверка на быков
	bulls = bullsNum (str1, str2);

	//проверка на коров
	cows = cowsNum (str1, str2);

	//вывод результата
	printf(" Число коров:\t%d\n Число быков: \t%d\n", cows, bulls);

  system("pause");
}

//проверка что сторока состоит из чисел
int dec (char str [MAX_STRING_LEN]) {

	char strNum[11] = "0123456789";
	int counter = 0;

	for (int i = 0; i < 10; i ++ ) {
		for (int j = 0; j < strlen(str); j ++ ) {
			if (strNum[i] == str[j]) {
				counter++;
			}
		}
	}
	if (counter == strlen(str)) {
		return 1;
	} else {
		return 0;
	}
}

//подсчет коров
int cowsNum (char str_1 [MAX_STRING_LEN], char str_2 [MAX_STRING_LEN]) {

	int result = 0;
	for (int i = 0; i < strlen(str_1); i ++ ) {
		for (int j = 0; j < strlen(str_2); j ++ ) {
			if ( (str_1[i] == str_2[j]) & (i != j) ) {
				result++;
				str_1[i] = "a";
				str_2[j] = "b";
			}
		}
	}
	return result;
}

//подсчет быков
int bullsNum (char str_1 [MAX_STRING_LEN], char str_2 [MAX_STRING_LEN]) {

	int result = 0;
	for (int i = 0; i < strlen(str_1); i ++ ) {
		for (int j = 0; j < strlen(str_2); j ++ ) {
			if ( (str_1[i] == str_2[j]) & (i == j) ) {
				result++;
				str_1[i] = "c";
				str_2[j] = "d";
			}
		}
	}
	return result;
}
