/**
 * Created by IqbalMF on 2024.
 * Package
 */
object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifeCycleKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleKtx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeUiPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3:${Versions.composeMaterial3}" }
    val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
    val jUnitAndroid by lazy {"androidx.test.ext:junit:${Versions.jUnitAndroid}"}
    val jUnitCompose by lazy {"androidx.compose.ui:ui-test-junit4:${Versions.jUnitTest}"}
    val espressoTest by lazy {"androidx.test.espresso:espresso-core:${Versions.espressoTest}"}
    val uiTooling by lazy {"androidx.compose.ui:ui-tooling"}
    val uiTestManifest by lazy {"androidx.compose.ui:ui-test-manifest"}
    val splashScreen by lazy {"androidx.core:core-splashscreen:${Versions.splashScreen}"}
    val navigationCompose by lazy {"androidx.navigation:navigation-compose:${Versions.navigationCompose}"}
    val hiltAndroid by lazy {"com.google.dagger:hilt-android:${Versions.hiltAndroid}"}
    val hiltCompiler by lazy {"com.google.dagger:hilt-compiler:${Versions.hiltAndroid}"}
    val hiltNavigationCompose by lazy {"androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"}
    val retrofit by lazy {"com.squareup.retrofit2:retrofit:${Versions.retrofit}"}
    val retrofitConverterGson by lazy {"com.squareup.retrofit2:converter-gson:${Versions.retrofit}"}
    val coil by lazy {"io.coil-kt:coil-compose:${Versions.coil}"}
    val dataStorePreference by lazy {"androidx.datastore:datastore-preferences:${Versions.dataStorePreference}"}
    val foundationCompose by lazy {"androidx.compose.foundation:foundation:${Versions.foundationCompose}"}
    val accompanist by lazy {"com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanist}"}
    val paging by lazy {"androidx.paging:paging-runtime-ktx:${Versions.pagingVersion}"}
    val pagingCompose by lazy {"androidx.paging:paging-compose:${Versions.pagingVersion}"}
    val room by lazy {"androidx.room:room-runtime:${Versions.roomVersion}"}
    val roomCompiler by lazy {"androidx.room:room-compiler:${Versions.roomVersion}"}
    val roomKtx by lazy {"androidx.room:room-ktx:${Versions.roomVersion}"}

}
object Modules {
    const val utilities = ":utilities"
}