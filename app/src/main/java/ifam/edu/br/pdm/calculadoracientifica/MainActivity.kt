package ifam.edu.br.pdm.calculadoracientifica

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import ifam.edu.br.pdm.calculadoracientifica.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var telaVisivel = true

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val expressao = binding.textViewExpressao

        binding.buttonSin.setOnClickListener {
            expressao.text = "${expressao.text}sin("
        }

        binding.buttonCos.setOnClickListener {
            expressao.text = "${expressao.text}cos("
        }

        binding.buttonTan.setOnClickListener {
            expressao.text = "${expressao.text}tan("
        }

        binding.buttonLn.setOnClickListener {
            expressao.text = "${expressao.text}ln("
        }

        binding.buttonLog.setOnClickListener {
            expressao.text = "${expressao.text}log("
        }

        binding.buttonFat.setOnClickListener {
            expressao.text = "${expressao.text}!"
        }

        binding.buttonPi.setOnClickListener {
            expressao.text = "${expressao.text}π"
        }

        binding.buttonFunExp.setOnClickListener {
            expressao.text = "${expressao.text}e"
        }

        binding.buttonParentese1.setOnClickListener {
            expressao.text = "${expressao.text}("
        }

        binding.buttonParentese2.setOnClickListener {
            expressao.text = "${expressao.text})"
        }

        binding.buttonRaiz.setOnClickListener {
            expressao.text = "${expressao.text}√("
        }

        binding.buttonPotencia.setOnClickListener {
            expressao.text = "${expressao.text}^("
        }

        binding.buttonI.setOnClickListener {
            expressao.text = "${expressao.text}i("
        }

        binding.buttonX.setOnClickListener {
            expressao.text = "${expressao.text}x("
        }

        binding.buttonAdd.setOnClickListener {
            val tela = binding.expressao
            telaVisivel = !telaVisivel

            if (telaVisivel) {
                tela.visibility = View.VISIBLE
            } else {
                tela.visibility = View.GONE
            }
        }

        binding.buttonUm.setOnClickListener {
            expressao.text = "${expressao.text}1"
        }

        binding.buttonDois.setOnClickListener {
            expressao.text = "${expressao.text}2"
        }

        binding.buttonTres.setOnClickListener {
            expressao.text = "${expressao.text}3"
        }

        binding.buttonQuatro.setOnClickListener {
            expressao.text = "${expressao.text}4"
        }

        binding.buttonCinco.setOnClickListener {
            expressao.text = "${expressao.text}5"
        }

        binding.buttonSeis.setOnClickListener {
            expressao.text = "${expressao.text}6"
        }

        binding.buttonSete.setOnClickListener {
            expressao.text = "${expressao.text}7"
        }

        binding.buttonOito.setOnClickListener {
            expressao.text = "${expressao.text}8"
        }

        binding.buttonNove.setOnClickListener {
            expressao.text = "${expressao.text}9"
        }

        binding.buttonZero.setOnClickListener {
            expressao.text = "${expressao.text}0"
        }

        binding.buttonPonto.setOnClickListener {
            expressao.text = "${expressao.text}."
        }

        binding.buttonVoid3.setOnClickListener {
            expressao.text = ""
            binding.textViewResultado.text = ""
        }

        binding.buttonDivisao.setOnClickListener {
            expressao.text = "${expressao.text}÷"
        }

        binding.buttonMultiplicacao.setOnClickListener {
            expressao.text = "${expressao.text}×"
        }

        binding.buttonSubtracao.setOnClickListener {
            expressao.text = "${expressao.text}-"
        }

        binding.buttonAdicao.setOnClickListener {
            expressao.text = "${expressao.text}+"
        }

        binding.buttonDel.setOnClickListener {
            expressao.text = expressao.text.dropLast(1)
        }

        binding.buttonCalcular.setOnClickListener {
            val resultado = Expression(expressao.text.toString()).calculate()

            if (resultado.isNaN()) {
                binding.textViewResultado.text = getText(R.string.mensagemError)
            } else {
                binding.textViewResultado.text = resultado.toString()
            }
        }
    }
}

// Adaptação da lógica utilizando o Binding de Ivan Moura
// Fonte original: https://github.com/ivanrmoura/Calculadora-Kotlin-Android
// Data de obtenção: 2023-10-27