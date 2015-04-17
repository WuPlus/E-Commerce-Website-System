/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.sis.infsci2730.finalProject.service;

import edu.pitt.sis.infsci2730.finalProject.model.Record;
import edu.pitt.sis.infsci2730.finalProject.dao.RecordDao;
import java.util.List;

/**
 *
 * @author yanyanzhou
 */
public class RecordService {

    //search record by transaction_id

    public List<Record> GetRecordByTransactionID(final String id) {
        return RecordDao.GetRecordByProductID(id);
    }

    //search record by product_id
    public List<Record> GetRecordByProductID(final String id) {
        return RecordDao.GetRecordByProductID(id);
    }

    //insert new record by transaction_id
    public int InsertRecordByTransactionIDAndProductId(final String[] array) {
        return RecordDao.InsertRecordByTransactionIDAndProductId(array);
    }

    //delete records by transaction_id
    public int DeleteRecordByTransactionID(final String id) {
        return RecordDao.DeleteRecordByTransactionID(id);
    }

    //delete records by product_id
    public int DeleteRecordByProductID(final String id) {
        return RecordDao.DeleteRecordByProductID(id);
    }

    //update records by transaction_id and product_id
    public int UpdateRecordByTransactionIDAndProductID(final String[] array) {
        return RecordDao.UpdateRecordByTransactionIDAndProductID(array);
    }
}
