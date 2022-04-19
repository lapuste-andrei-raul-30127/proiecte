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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String DFF;
            DFF = textBox1.Text;
            textBox2.Text = DFF;
            Form2 secondForm = new Form2();
            secondForm.Show(); // afiseaza a doua forma
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
