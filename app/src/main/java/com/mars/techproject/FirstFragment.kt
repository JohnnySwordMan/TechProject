package com.mars.techproject

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.mars.designpattern.factory.FactoryManager
import com.mars.loginapi.ILoginService
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            FactoryManager.startSimpleFactory()
//            FactoryManager.startNormalFactory()
//            FactoryManager.startNormalPlusFactory()
//            FactoryManager.startAbstractFactory()

            login()
        }
    }

    private fun login() {
        val loader = ServiceLoader.load(ILoginService::class.java)
        val iterator = loader.iterator()
        var loginService: ILoginService? = null
        while (iterator.hasNext()) {
            loginService = iterator.next()
        }
        Log.e("mars", "FirstFragment---start login---loginService = $loginService")
        loginService?.register()
        loginService?.login("mars", "123")
    }
}