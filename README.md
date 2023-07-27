# SplashScreen

## To make splash screen add following:
1. Add `android.enableJetifier=true` in gradle.properties  and sync the project <br>
2. add this on splashScreen.kt `Handler().postDelayed({
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }, 3000)`
