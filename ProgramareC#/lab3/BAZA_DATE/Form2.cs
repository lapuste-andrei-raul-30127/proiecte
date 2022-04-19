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
    public partial class Form2 : Form
    {
        SqlConnection conn = new SqlConnection();
        DataSet dsUni;
        DataSet dsFac;
        SqlDataAdapter dsUni_ad;
        public Form2()
        {
            InitializeComponent();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            conn.ConnectionString = @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = C:\Users\Asus\Desktop\II\lab3\BAZA_DATE\Database1.mdf; Integrated Security = True";
            conn.Open();
            dsUni = new DataSet();
            dsFac = new DataSet();

            dsUni_ad = new SqlDataAdapter("SELECT * FROM Universitate", conn);
            dsUni_ad.Fill(dsUni, "Universitate");
            conn.Close();
            
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            conn.Open();
            string s1 = textBox1.Text;
            string s2= textBox2.Text;
            int s3= Convert.ToInt16(textBox3.Text);
            dsUni_ad = new SqlDataAdapter("INSERT INTO Universitate(NameUniv,City,Code) VALUES ('"+s1 +"','"+s2 +"','"+s3+"')", conn);
            dsUni_ad.Fill(dsUni, "Universitate");
            dsUni_ad.Update(dsUni, "Universitate");
            conn.Close();
            dsUni_ad.Dispose();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            conn.Open();
            string s1 = textBox1.Text;
            string s2 = textBox2.Text;
            int s3 = Convert.ToInt16(textBox3.Text);
            dsUni_ad = new SqlDataAdapter("UPDATE Universitate SET NameUniv='"+s1+"',City='"+s2+"' WHERE Code="+s3, conn);
            dsUni_ad.Fill(dsUni, "Universitate");
            dsUni_ad.Update(dsUni, "Universitate");
            conn.Close();
            dsUni_ad.Dispose();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            conn.Open();
            string s1 = textBox1.Text;
            string s2 = textBox2.Text;
            int s3 = Convert.ToInt16(textBox3.Text);
            dsUni_ad = new SqlDataAdapter("DELETE FROM Universitate WHERE Code="+s3, conn);
            dsUni_ad.Fill(dsUni, "Universitate");
            dsUni_ad.Update(dsUni, "Universitate");
            conn.Close();
            dsUni_ad.Dispose();
        }
    }
}
