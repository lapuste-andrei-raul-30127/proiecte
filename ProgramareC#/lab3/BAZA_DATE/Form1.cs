using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace BAZA_DATE
{
    public partial class Form1 : Form
    {
        
        SqlConnection conn= new SqlConnection();
        DataSet dsUni;
        DataSet dsFac;

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            conn.ConnectionString = @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = C:\Users\Asus\Desktop\II\lab3\BAZA_DATE\Database1.mdf; Integrated Security = True";
            conn.Open();
            dsUni = new DataSet();
            dsFac = new DataSet();

            SqlDataAdapter dsUni_ad = new SqlDataAdapter("SELECT * FROM Universitate", conn);
            dsUni_ad.Fill(dsUni, "Universitate");
            
            SqlDataAdapter dsFac_ad = new SqlDataAdapter("SELECT * FROM Facultati", conn);
            dsFac_ad.Fill(dsFac, "Facultati");

            foreach (DataRow dr in dsUni.Tables["Universitate"].Rows)
            {
                String Name = dr.ItemArray.GetValue(1).ToString();
                listBox1.Items.Add(Name);
            }
            conn.Close();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            listBox2.Items.Clear();
            textBox1.Clear();
            int code = 0;
            String Uni_selected = listBox1.SelectedItem.ToString();
            foreach (DataRow dr in dsUni.Tables["Universitate"].Rows)
            {
                if (Uni_selected == dr.ItemArray.GetValue(1).ToString())
                { 
                    textBox1.Text = dr.ItemArray.GetValue(2).ToString();
                    code= Convert.ToInt16(dr.ItemArray.GetValue(3));
                    MessageBox.Show(code.ToString());
                    textBox2.Text=code.ToString();
                }
            }
            foreach (DataRow dr in dsFac.Tables["Facultati"].Rows)
            {
                if (code == Convert.ToInt16(dr.ItemArray.GetValue(1)))
                {
                    String name = dr.ItemArray.GetValue(2).ToString();
                    listBox2.Items.Add(name);
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 ff = new Form2();
            ff.ShowDialog();

            
        }
    }
}
