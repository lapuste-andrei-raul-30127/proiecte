#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define M 32
void citire(char ** v)
{
    FILE *f = fopen("input.txt", "r");
    if(!f)
        {
        printf("NU s-a deschis fișierul input.txt...");
        exit(1);
        }
    char buf[100];
    int i=0;
    while(!feof(f))
        {
        fscanf(f, "%s", buf);
        v[i] = (char *)malloc((strlen(buf)+1)*sizeof(char));
        strcpy(v[i], buf);
        i++;
        }
fclose(f);
}

int cautare_binara(char *valoare, char **v)
{
    int st = 0, mij, dr = M-1, caut;
    while ( st <= dr )
        {
        mij = (st + dr)/2;
        caut = strcmp(v[mij], valoare);
        if(caut == 0)
            {
                return mij;
            }
        else
            {
                if(caut < 0)
                {
                    st = mij + 1;
                }
                else
                {
                    dr = mij - 1;
                }
            }
        }
    return -1;
}
int main()
{
    char *HT[M], raspuns, cuvant[100];
    citire(HT);
    do
        {
    printf("Introduceti cuvantul ");
    scanf("%s", cuvant);
    if(cautare_binara(cuvant, HT)==-1)
        {
        printf("NU este cuvant rezervat...\n");
        }
    else
    {
        printf("DA este cuvant rezervat...\n");
    }
    printf("Doriti sa continuati? (D/d)");
    fflush(stdin);///curata ecranul si lasa sa introduc valori de la tastatura daca programul nu reuseste sa ma lase sa citesc
    scanf("%c", &raspuns);

        }while(raspuns == 'd' || raspuns == 'D');
}
