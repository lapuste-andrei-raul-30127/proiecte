using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab1_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            /*
            E2 pp = new E2();
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int x=pp.scad(a,b);
            pp.Afis(x);*/
            

            /*
            E3 pp = new E3();
            float a = Convert.ToSingle(Console.ReadLine());
            Console.WriteLine(pp.F_C(a));
            Console.ReadKey();
            */

            /*E4 pp=new E4();
            pp.kg = Convert.ToInt16(Console.ReadLine());
            pp.cm = Convert.ToInt16(Console.ReadLine());
            pp.vr = Convert.ToInt16(Console.ReadLine());
            pp.gen = Convert.ToChar(Console.ReadLine());
            pp.Afis();
            */
            E5 pp= new E5();
            int[] a = new int[10];
            int n = int.Parse(Console.ReadLine());
            for (int i = 0; i < n; i++) { 
                a[i]=int.Parse(Console.ReadLine());
            }
            Console.WriteLine("{0}  {1}", pp.M_arm(a,n), pp.M_geo(a,n));
            Console.ReadKey();


        }

        public class E1
        {

            public void Exercitiu1()
            {
                int a = 0;
                int b = 1;
                int c;
                int n;
                Console.WriteLine("Introduceti un n=");
                n = Convert.ToInt16(Console.ReadLine());
                Console.WriteLine("Elementele:\n{0}\n{1}", a, b);
                while (n > 2)
                {
                    c = a + b;
                    Console.WriteLine(c);
                    a = b; b = c;
                    n--;
                }
                Console.ReadKey();

            }
            public void Exercitiu2()
            {
                Console.WriteLine("mmgmgmmg");
                Console.ReadKey();



            }
        }

        public class E2
        {
            public int inmultire(int a, int b)
            {
                return a * b;
            }

            public int adunare(int a, int b)
            {
                return a + b;
            }

            public int impart(int a, int b)
            {
                return a / b;
            }

            public int scad(int a, int b)
            {
                return a - b;
            }

            public void Afis(int x)
            {
                Console.WriteLine("Rezultat={0}", x);
                Console.ReadKey();
            }

        }

        public class E3
        {

            public float C_F(float c)
            {
                return c * 9 / 5 + 32;
            }

            public float F_C(float f)
            {
                return (f - 32)/ 9*5;
            }


        }

        public class E4 {
            public int kg;
            public int cm;
            public int vr;
            public char gen;
            
            public float Perfect()
            {
                switch (this.gen) {
                    case 'f': { return Convert.ToSingle(this.cm - 100 - (this.cm-150) / 2.5 + (this.vr - 20) / 6); }

                    case 'm': { return Convert.ToSingle(this.cm - 100 - (this.cm-150) / 4 + (this.vr - 20) / 4); }
                    
                }
                return 0;
            }

            public void Afis() { 
                Console.WriteLine("Greutatea perfecta = {0}",this.Perfect());
                Console.ReadKey();
            }
        }

        public class E5 {
            public float M_arm(int[] a,int n) {
                float x=0;
                for (int i = 0; i < a.Length; i++)
                    x = x + a[i];
                return x/n;
            }

            public double M_geo(int[] a,int n) {
                double x = 1;
                for (int i = 0; i < n; i++)
                    x = x*a[i];
                return Math.Pow(x, 1.0 / n);
            }
        }
    }
}


