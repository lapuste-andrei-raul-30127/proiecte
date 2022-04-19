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
    public partial class Form3 : Form
    {
        SqlConnection conn = new SqlConnection();
      
        DataSet dsFac;
        
        SqlDataAdapter dsFac_ad;
        public Form3()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            conn.Open();

            SqlCommandBuilder sda= new SqlCommandBuilder(dsFac_ad);
            dsFac_ad.Update(dsFac.Tables["Facultati"]);


            conn.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            conn.Open();

            SqlCommandBuilder sda = new SqlCommandBuilder(dsFac_ad);
            foreach (DataGridViewRow row in dataGridView1.SelectedRows) {
                dataGridView1.Rows.RemoveAt(row.Index);
            }
            dsFac_ad.Update(dsFac.Tables["Facultati"]);
            conn.Close();
        }

        private void Form3_Load(object sender, EventArgs e)
        {
            conn.ConnectionString = @"Data Source = (LocalDB)\MSSQLLocalDB; AttachDbFilename = C:\Users\Asus\Desktop\II\lab3\BAZA_DATE\Database1.mdf; Integrated Security = True";
            conn.Open();
            
            dsFac = new DataSet();
            dsFac_ad = new SqlDataAdapter("SELECT * FROM Facultati", conn);
            dsFac_ad.Fill(dsFac, "Facultati");
            dataGridView1.DataSource= dsFac.Tables["Facultati"];

            
            conn.Close();
        }
    }
}
