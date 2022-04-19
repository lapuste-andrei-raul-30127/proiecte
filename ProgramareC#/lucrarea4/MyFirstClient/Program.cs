using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MyFirstClient
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyFirstClient.ServiceReference1.WebService1SoapClient serv= new MyFirstClient.ServiceReference1.WebService1SoapClient();
            int x = serv.Add(2, 3);
            Console.WriteLine(x);
        }
    }
}
