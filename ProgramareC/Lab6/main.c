#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct tip_nod
{
char * cuvant;
int frecventa;
struct tip_nod *st,*dr;
} TIP_NOD;
void afisare(TIP_NOD *p)
{
if (p!=0)
{
afisare(p->st);
printf("%s %d\n", p->cuvant, p->frecventa);
afisare(p->dr);
}
}
void inserare(TIP_NOD **rad, char *cuvant)
{
    TIP_NOD *p, *q;
int cmp;
p = (TIP_NOD *)malloc(sizeof(TIP_NOD));
p->cuvant = (char *)malloc((strlen(cuvant)+1)*sizeof(char));
strcpy(p->cuvant, cuvant);
p->frecventa = 1;
p->st = p->dr = 0;
if(*rad==0)
{
*rad = p;
return;
}
q = *rad;
for(;;)
{
cmp = strcmp(cuvant, q->cuvant);
if (cmp < 0)
{
if(q->st == 0)
{
q->st = p;
return;
}
else
{
q = q->st;
}
}
else
{
if(cmp > 0)
{
if(q->dr == 0)
{
q->dr=p;
return;
}
else
    {
q=q->dr;
}
}
else
{ /* cuvântul există, creștem frecvența */
q->frecventa++;
free(p);
return;
}
}
}
}
void cautare(TIP_NOD *rad, char *cuvant)
{
  TIP_NOD *p;
int cmp;
if(rad == 0)
{ /* arborele este vid */
printf("Arborele NU conține cuvinte...");
getch();
return;
}
p = rad;
while(p != 0)
{
cmp = strcmp(cuvant, p->cuvant);
if(cmp == 0)
{ /* s-a gasit cuvântul căutat */
printf("Cuvântul %s are frecvența %d\n", cuvant, p->frecventa);
getch();
return;
}
else
{
if(cmp < 0) p=p->st;
else p=p->dr;
}
}
printf("NU există cuvântul căutat...");
getch();
}
void citire(TIP_NOD **rad)
{
FILE *f = fopen("input.txt", "r");
if(!f)
{printf("NU s-a deschis fișierul input.txt...");
getch();
exit(1);
}
char buf[100];
while(!feof(f))
{
buf[0] = 0;
fscanf(f, "%s", buf);
if(buf[0])
{
inserare(rad, buf);
}
}
fclose(f);
}
void main(void)
{
TIP_NOD *rad = 0;
char raspuns;
char cuvant[100];
citire(&rad);
afisare(rad);
do
{
printf("Introduceți cuvântul căutat = ");
scanf("%s", cuvant);
cautare(rad, cuvant);
printf("Doriți să continuați (D sau d, orice altceva renunțați)? ");
scanf("%c", &raspuns);
} while(raspuns == 'D' || raspuns == 'd');
return 0;
}
