package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class Ssak {
}

class Kot extends Ssak {

}

class Tygrys extends Kot {

}

@Component
class TygrysSyberyjski extends Tygrys {

}
