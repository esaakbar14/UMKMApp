plugins {
    alias(libs.plugins.androidApplication)
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "id.co.umkmapps"
    compileSdk = 34

    defaultConfig {
        applicationId = "id.co.umkmapps"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("com.github.bumptech.glide:glide:4.11.0")
    implementation ("com.loopj.android:android-async-http:1.4.9")

    implementation ("com.google.code.gson:gson:2.10.1")

    implementation ("com.squareup.retrofit2:retrofit:2.6.4")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.4")

    implementation ("com.squareup.okhttp3:logging-interceptor:3.8.0")
    implementation("androidx.core:core-ktx:+")
    debugImplementation ("com.github.chuckertean.chucker:library:3.3.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation ("com.github.chuckerteam.chucker:library:3.5.2")
    implementation ("androidx.appcompat:appcompat:1.3.1")




}