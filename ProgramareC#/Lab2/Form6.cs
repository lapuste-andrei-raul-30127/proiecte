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
    public partial class Form6 : Form
    {
        public Form6()
        {
            InitializeComponent();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            string snt = @"C:\Users\Asus\Pictures\"+ listBox1.SelectedItem.ToString()+".jpg";
            pictureBox1.Load(snt);
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void tabPage2_Click(object sender, EventArgs e)
        {
            string n="";
            if(radioButton1.Checked==true) { n= n+radioButton1.Text; }
            if (radioButton2.Checked == true) { n = n + radioButton2.Text; }
            if (radioButton3.Checked == true) { n = n + radioButton3.Text; }
            if (radioButton4.Checked == true) { n = n + radioButton4.Text; }
            MessageBox.Show(n);
        }

        private void Form6_Load(object sender, EventArgs e)
        {

        }
    }
}
