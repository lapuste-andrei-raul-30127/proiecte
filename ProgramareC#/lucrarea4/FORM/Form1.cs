using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FORM
{
    public partial class Form1 : Form
    {
        FORM.ServiceReference1.WebService1SoapClient wb = new FORM.ServiceReference1.WebService1SoapClient();
        public Form1()
        {
            InitializeComponent();
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            List<string> list = new List<string>();
            list = wb.lista();
            foreach (string s in list) { 
                listBox1.Items.Add(s);
            }
            label2.Visible = true;
            label2.Text=wb.data_ora().ToString();

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            float x = (float)Convert.ToDouble(textBox1.Text);
            textBox2.Text =Convert.ToString(wb.convr(x));
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            float x = (float)Convert.ToDouble(textBox3.Text);
            x = wb.lei_euro(x);
            textBox4.Text = Convert.ToString(x);
        }
    }
}
