package com.labib.onebankassignment

import android.content.Intent
import androidx.biometric.BiometricManager

import androidx.biometric.BiometricPrompt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.biometric.BiometricPrompt.PromptInfo

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


      val  promptInfo = PromptInfo.Builder()
            .setTitle(getString(R.string.biometric_title))
            .setSubtitle(getString(R.string.biometric_subtitle))
            .setDescription(getString(R.string.biometric_description))
            .setNegativeButtonText(getString(R.string.biometric_negative_button_text))
            .setAllowedAuthenticators(BiometricManager.Authenticators.BIOMETRIC_WEAK)
            .build()
        val biometricPrompt =
            BiometricPrompt(this,  object : BiometricPrompt.AuthenticationCallback() {
                override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                    super.onAuthenticationError(errorCode, errString)
                    if (errorCode == BiometricPrompt.ERROR_NEGATIVE_BUTTON) {
                        // user clicked negative button
                    } else {
                        //TODO: Called when an unrecoverable error has been encountered and the operation is complete.
                    }
                }

                override   fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                    super.onAuthenticationSucceeded(result)
                    //TODO: Called when a biometric is recognized.

                    this@LoginActivity.startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                }

                override fun onAuthenticationFailed() {
                    super.onAuthenticationFailed()
                    //TODO: Called when a biometric is valid but not recognized.
                }
            })

        findViewById<Button>(R.id.btnforgotpin).setOnClickListener {





                        biometricPrompt.authenticate(promptInfo)



                }

        findViewById<Button>(R.id.btnlogin).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}