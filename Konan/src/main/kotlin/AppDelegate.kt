//
//  AppDelegate.kt
//  Konan
//
//  Created by theapache64 on 04/05/18.
//  Copyright © 2018 theah64. All rights reserved.
//

import kotlinx.cinterop.*
import platform.UIKit.*

class AppDelegate : UIResponder(), UIApplicationDelegateProtocol {
    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta {}

    override fun init() = initBy(AppDelegate())

    private var _window: UIWindow? = null
    override fun window() = _window
    override fun setWindow(window: UIWindow?) { _window = window }
}
