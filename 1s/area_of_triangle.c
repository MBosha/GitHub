#include<stdlib.h>
#include<stdio.h>
#include<math.h>
int main(){

	system("chcp 1251");

  int a = 0, b = 0, c = 0;
  float p = 0, s = 0;

  printf("\a Введите длины сторон трегугольника:\n");
	scanf("%d %d %d", &a, &b, &c);

	if (!(a + b > c) || !(a + c > b) || !(b + c > a) || (a < 1) || (b < 1) || (c < 1)) {
		printf("\a Не верный ввод данных.\n");
		goto end;
	}

  p = (a + b + c) / 2;
  s = sqrt(p * (p - a) * (p - b) * (p - c));
  printf("\a Площадь треугольника равна: %f \n", s);
  system("pause");
  end:;
}
