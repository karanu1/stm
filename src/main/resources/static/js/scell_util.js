
var customHref = function(href, target){
    $.ajax({
        type    : "get",
        url     : href,
        dataType : "html",
        cache   : false
    }).done((html) => {
        let element = 'main';
        if(target){
            element = target;
        }
        $(element).html(html);
    }).fail((a, b, c) => {
        console.log(a);
        console.log(b);
        console.log(c);
    });
}
var duesDeposit = function(){
    if(confirm("월 회비를 입금하셨습니까?")) {
        $.ajax({
            type    : "post",
            url     : "/deposit",
            data    : {data : "postData"},
            cache : false,
            contentType : false,
        }).done((data) => {
            console.log(data);
        }).fail((a,b,c) => {
            console.log(a);
            console.log(b);
            console.log(c);
        })
    } else {

    }
}

var registration = function(){

    var url = "https://kauth.kakao.com/oauth/authorize?client_id=c7cc76d651eea6698ac3659af71756db&redirect_uri=http://localhost:9999/login&response_type=code";
    if(confirm("회원가입 하시겠습니까?")) {
        location.replace(url);
    } else {
        console.log("꺄꺄");
    }

}