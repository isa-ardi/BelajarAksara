package com.example.belajaraksarajawa

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_aksara_jawa.*
import kotlinx.android.synthetic.main.activity_ba.*
import kotlinx.android.synthetic.main.activity_ha.view.*
import kotlinx.android.synthetic.main.activity_aksara_jawa.na as na1

class AksaraJawaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btn: MediaPlayer
        lateinit var runnable:Runnable
        var handler: Handler = Handler()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aksara_jawa)
        ha.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ha,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        na.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_na,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ca.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ca,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ra.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ra,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ka.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ka,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        da.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_da,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ta.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ta,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        sa.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_sa,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        wa.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_wa,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        la.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_la,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        pa.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_pa,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        dha.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_dha,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ja.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ja,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        ya.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ya,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        nya.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_nya,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ma.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ma,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ga.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ga,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        ba.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_ba,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        tha.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_tha,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        nga.setOnClickListener{
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_nga,null)
            val mBuilder = AlertDialog.Builder(this).setView(mDialogView).setTitle("Detail")
            val mAlertDialog = mBuilder.show()
            mDialogView.ok.setOnClickListener{
                mAlertDialog.dismiss()
            }
        }
        kmbl.setOnClickListener{startActivity(Intent(this,PilihActivity::class.java))}
        }
    }
}
