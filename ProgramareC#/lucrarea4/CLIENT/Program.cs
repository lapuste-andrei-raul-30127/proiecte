using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CLIENT
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CLIENT.ServiceReference1.WebService1SoapClient wb=new CLIENT.ServiceReference1.WebService1SoapClient();
            while (true)
                {
                Console.WriteLine("Pres 1 for list /// Pres 2 for F->C /// Pres 3 for Date_Hour /// Pres 4 for lei->euro");
                int x = Convert.ToInt16(Console.ReadLine());
                switch(x) {
                    case 1: {
                            List < string > cump= wb.lista();
                            foreach (string s in cump) { 
                                Console.WriteLine(s);
                            } 
                            break;
                        
                        }
                    case 2: {
                            int v= Convert.ToInt16(Console.ReadLine());
                            Console.WriteLine(wb.convr(v));
                            break;
                        }
                    case 3: 
                        {
                            Console.WriteLine(wb.data_ora());
                            break;
                        }
                    case 4: 
                        {
                            int v = Convert.ToInt16(Console.ReadLine());
                            Console.WriteLine("Suma de "+v+" lei="+wb.lei_euro(v)+" euro");
                            break;
                        }

                }
                }
        }
    }
}
