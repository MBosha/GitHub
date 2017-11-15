#include<stdlib.h>
#include<stdio.h>
int main(){

	system("chcp 1251");
  int a = 0, b = 0;

  printf("\a Введите год:\n");
	scanf("%d",&a);

	if ((a == 0) || (a < 0)) {
		printf("\a Не верный ввод данных.\n");
		goto end;
	}
	if (((a%4 == 0) && (a%100 != 0)) || (a%400 == 0)) {
		printf("\a %d - високосный год.\n", a);
	} else {
		printf("\a %d - не високосный год.\n", a);
	}

  system("pause");
	end:;
	}
