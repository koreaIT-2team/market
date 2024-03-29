
//  function requestPay() {
//     // IMP.request_pay(param, callback) 결제창 호출
//     IMP.request_pay({ // param
//         pg: "html5_inicis",
//         pay_method: "card",
//         merchant_uid: "ORD20180131-0000011",
//         name: "노르웨이 회전 의자",
//         amount: 64900,
//         buyer_email: "gildong@gmail.com",
//         buyer_name: "홍길동",
//         buyer_tel: "010-4242-4242",
//         buyer_addr: "서울특별시 강남구 신사동",
//         buyer_postcode: "01181"
//     }, function (rsp) { // callback
//         if (rsp.success) {
//         } else {
//     });
//   }



class Payment {
    #IMP = null;

    constructor() {
        this.#IMP = window.IMP;
        this.#IMP.init("imp11788573");
        this.addPaymentEvent();
    }

    addPaymentEvent() {
        document.querySelector(".kakaopay-button").onclick = () => {
            this.requestPay();
        }
    }
    requestPay() {
        const pdtName = document.querySelector(".product-name").textContent;


        IMP.request_pay({ // param
            pg: "kakaopay",
            pay_method: "card",
            merchant_uid: "PRODUCT-" + new Date().getTime(),
            name: "그냥",
            amount: 64900,
            buyer_email: "gildong@gmail.com",
            buyer_name: "홍길동",
            buyer_tel: "010-4242-4242",
            buyer_addr: "서울특별시 강남구 신사동",
            buyer_postcode: "01181"
        }, function (rsp) { // callback
            if (rsp.success) {
            } else {
            
            }
        });
    }
    
}

