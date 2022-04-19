using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab2
{
    public partial class Form5 : Form
    {
        public Form5()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            float x = (float)Convert.ToDouble(textBox1.Text);
            float y = (float)Convert.ToDouble(textBox2.Text);
            float z = x + y;
            textBox3.Text = z.ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            float x = (float)Convert.ToDouble(textBox1.Text);
            float y = (float)Convert.ToDouble(textBox2.Text);
            float z = x - y;
            textBox3.Text = z.ToString();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            float x = (float)Convert.ToDouble(textBox1.Text);
            float y = (float)Convert.ToDouble(textBox2.Text);
            float z = x/y;
            textBox3.Text = z.ToString();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            float x = (float)Convert.ToDouble(textBox1.Text);
            float y = (float)Convert.ToDouble(textBox2.Text);
            float z = x * y;
            textBox3.Text = z.ToString();
        }
    }
}
