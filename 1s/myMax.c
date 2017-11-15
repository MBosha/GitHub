#include<stdlib.h>
#include<stdio.h>
int main(){

	system("chcp 1251");
  int a = 0, b = 0, c = 0, myMax = 0;
  printf("\a Введите три числа:\n");
	scanf("%d %d %d",&a, &b, &c);

  myMax = a;

  if (b > myMax) {
    myMax = b;
	}

  if (c > myMax) {
    myMax = c;
	}

  if (myMax != 0) {
  	printf("\a Максимальное число - %d\n", myMax);

  } else {
  	printf("\a Неверный ввод данных.");
  }

  system("pause");

	}
