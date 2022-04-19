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
    public partial class Form7 : Form
    {
        public Form7()
        {
            InitializeComponent();
        }

        private void notifyIcon1_MouseDoubleClick(object sender, MouseEventArgs e)
        {

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            trackBar1.Visible = true;
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (radioButton1.Checked == true)
                MessageBox.Show("YOU ARE AWFULL");
            if (radioButton2.Checked == true)
                switch (trackBar1.Value) {
                    case 0:
                        {
                            MessageBox.Show("YOU LIED");
                            break;
                        }
                    case 1: {
                            MessageBox.Show("I can't forgive you...");
                            break;
                        }
                    case 2:
                        {
                            MessageBox.Show("Not today");
                            break;
                        }
                    case 3:
                        {
                            MessageBox.Show("I need time..");
                            break;
                        }
                    case 4:
                        {
                            MessageBox.Show("Maybe");
                            break;
                        }
                    case 5:
                        {
                            MessageBox.Show("This sucks but ok");
                            break;
                        }
                    case 10: 
                        {
                            MessageBox.Show("You are Spectacular");
                            break;
                        }
                    default: {
                            MessageBox.Show("Ok i forgive you");
                            break;
                        }


                }
        }
    }
}
