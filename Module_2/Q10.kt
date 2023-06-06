package Module_2

fun main() {
    val hashMap:HashMap<String,String> = HashMap<String,String>()
    hashMap.put("Gujarat","Surat")
    hashMap.put("Rajasthan","Udaypur")
    hashMap.put("Gujarat","Ambaji")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }
}