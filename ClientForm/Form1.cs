using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Text.Json.Serialization;

using System.Threading.Tasks;
using System.Windows.Forms;
using System.Net.Http;



namespace ClientForm
{
    public partial class Form1 : Form
    {
        ServiceReference1.WebService1SoapClient srv = new ServiceReference1.WebService1SoapClient();
        public Form1()
        {
            InitializeComponent();
           
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text != "")
            {
                HttpClient client = new HttpClient();
                client.BaseAddress = new Uri("http://localhost:8008/api/Test1/");
                HttpResponseMessage respo = client.GetAsync("Gett?key=" + textBox1.Text).Result;
                var x = respo.Content.ReadAsStringAsync().Result;
                listBox1.Items.Add("Currently =>" + x);
            }
            else { listBox1.Items.Add("Please introduce key"); }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (textBox1.Text != "")
                if(textBox2.Text !="")
                    {
                    HttpClient client = new HttpClient();
                    var url = "http://localhost:8008/api/Test1/Adds?key="+textBox1.Text+"&value="+textBox2.Text;
                    var SC = "comanda";
                    var newSC=JsonSerializer.Serialize(SC);
                    var stringCOntent = new StringContent(newSC,Encoding.UTF8, "application/json");
                    var respons=client.PostAsync(url,stringCOntent).Result;
                    MessageBox.Show(respons.ToString());
                    listBox1.Items.Add("Cache item Uploaded/Updated : " + textBox1.Text + " ,  value :" + textBox2.Text);
                }
                else { listBox1.Items.Add("Please introduce value"); }
            else { listBox1.Items.Add("Please introduce key"); }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (textBox1.Text != "")
            {
                HttpClient client = new HttpClient();
                client.BaseAddress = new Uri("http://localhost:8008/api/Test1/");
                HttpResponseMessage respo = client.DeleteAsync("del?key=" + textBox1.Text).Result;
                var x = respo.Content.ReadAsStringAsync().Result;
                MessageBox.Show(respo.ToString());
            }
            else { listBox1.Items.Add("Please introduce key"); }
        }
    }
}
