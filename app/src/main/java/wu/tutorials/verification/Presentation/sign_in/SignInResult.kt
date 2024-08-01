package wu.tutorials.verification.Presentation.sign_in

import android.service.autofill.UserData

data class SignInResult(
    val data:wu.tutorials.verification.Presentation.sign_in.UserData?,
    val errorMessage:String?
)
data class UserData(
    val userId:String,
    val username:String?,
    val profilePictureUrl:String?
)