package com.example.demo.service
import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun sayHey(name:String?):String{
        if(name==null){
            return "Who are you?"
        }else{
            return "Hey $name. How are you"
        }
    }
}