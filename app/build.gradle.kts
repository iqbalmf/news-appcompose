plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id ("com.google.dagger.hilt.android")
    id ("kotlin-parcelize")
}

android {
    namespace  = "net.iqbalfauzan.news_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "net.iqbalfauzan.news_app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName  = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation (Dependencies.coreKtx)
    implementation (Dependencies.lifeCycleKtx)
    implementation (Dependencies.activityCompose)
    implementation (Dependencies.composeUi)
    implementation (Dependencies.composeUiGraphics)
    implementation (Dependencies.composeUiPreview)
    implementation (Dependencies.composeMaterial3)
    testImplementation (Dependencies.jUnit)
    androidTestImplementation (Dependencies.jUnitAndroid)
    androidTestImplementation (Dependencies.espressoTest)
    androidTestImplementation (Dependencies.jUnitCompose)
    debugImplementation (Dependencies.uiTooling)
    debugImplementation (Dependencies.uiTestManifest)
    //Splash Api
    implementation (Dependencies.splashScreen)
    //Compose Navigation
    implementation (Dependencies.navigationCompose)
    //Dagger Hilt
    implementation (Dependencies.hiltAndroid)
    kapt (Dependencies.hiltCompiler)
    implementation (Dependencies.hiltNavigationCompose)
    //Retrofit
    implementation (Dependencies.retrofit)
    implementation (Dependencies.retrofitConverterGson)
    //Coil
    implementation(Dependencies.coil)
    //Datastore
    implementation (Dependencies.dataStorePreference)
    //Compose Foundation
    implementation (Dependencies.foundationCompose)
    //Accompanist
    implementation (Dependencies.accompanist)
    //Paging 3
    implementation (Dependencies.paging)
    implementation (Dependencies.pagingCompose)
    //Room
    implementation (Dependencies.room)
    kapt (Dependencies.roomCompiler)
    implementation (Dependencies.roomKtx)

    implementation(project(Modules.utilities))
}

kapt {
    correctErrorTypes = true
}