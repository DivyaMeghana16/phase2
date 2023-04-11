//package com.cg.onlineassesment.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.onlineassesment.dao.PaymentDTO;
//import com.cg.onlineassesment.service.PaymentService;
//
//@RestController
//@RequestMapping("/api/payment")
//public class PaymentController {
//	@Autowired
//	public PaymentService paymentService;
//	 
//    //http://localhost:9091/api/payment/addPayment
//    @PostMapping("/addPayment")
//    public ResponseEntity<PaymentDTO> addPayment(@RequestBody PaymentDTO payment) {
//
//        PaymentDTO savepayment = paymentService.addPayment(payment);
//        return ResponseEntity.ok(savepayment);
//
//    }
//
//    @GetMapping("/fetchPaymentById/{id}")
//    public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable int id) {
//        PaymentDTO paymentDTO = paymentService.getById(id);
//        return new ResponseEntity<PaymentDTO>(paymentDTO, HttpStatus.FOUND);
//    }
//
//    @PutMapping("/updatePayment")
//    public ResponseEntity<PaymentDTO> updatePayment(@RequestBody PaymentDTO paymentDTO) {
//        return new ResponseEntity<PaymentDTO>(paymentService.updatePayment(paymentDTO), HttpStatus.ACCEPTED);
//
//    }
//
//   @DeleteMapping("/deletePayment/{id}")
//    public ResponseEntity<?> deletePaymentById(@PathVariable int id) {
//    PaymentDTO paymentDTO = paymentService.getById(id);
//    if (paymentDTO != null) {
//        paymentService.deletePayment(paymentDTO);
//        return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
//        }
//    return new ResponseEntity<String>("The Payment id"+ id +"does not exists",HttpStatus.NOT_FOUND);
//}
//
//
//    @GetMapping("/fetchAllPayment")    
//    public ResponseEntity<List<PaymentDTO>> getAllPayment() {
//        List<PaymentDTO> list = paymentService.findAll();
//        return ResponseEntity.ok(list);
//        }
//
//
//}
