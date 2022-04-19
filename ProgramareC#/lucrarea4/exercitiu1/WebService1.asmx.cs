using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace exercitiu1
{
    /// <summary>
    /// Summary description for WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

        [WebMethod]
        public float convr(float a) {
            return (a - 32) * 5 / 9;
        }
        [WebMethod]
        public DateTime data_ora() {
            return DateTime.Now;
        }

        [WebMethod]
        public float lei_euro(float x)
         {
            return x / 5;
        }

        [WebMethod]
        public List<string> lista() 
        {   List<string> list= new List<string>();
            list.Add("apa");
            list.Add("Suc mere");
            list.Add("suc portocale");
            list.Add("Ananas");
            list.Add("piatra");
            return list;
        }
    }
}
