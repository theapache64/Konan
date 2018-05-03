//
//  ViewController.kt
//  Konan
//
//  Created by theapache64 on 04/05/18.
//  Copyright © 2018 theah64. All rights reserved.
//

import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*

@ExportObjCClass
class ViewController : UIViewController {

    constructor(aDecoder: NSCoder) : super(aDecoder)

    override fun initWithCoder(aDecoder: NSCoder) = initBy(ViewController(aDecoder))

    @ObjCOutlet
    lateinit var label: UILabel

    @ObjCOutlet
    lateinit var textField: UITextField

    @ObjCOutlet
    lateinit var button: UIButton

    @ObjCAction
    fun buttonPressed() {
        label.text = "Konan says: 'Hello, ${textField.text}!'"
    }

    @ObjCAction
    fun getGreetingsPressed() {
        label.text = "Helloooo ${textField.text}!'"
    }
}
