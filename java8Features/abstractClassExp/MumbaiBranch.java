package abstractClassExp;

class MumbaiBranch extends Branch{
    public boolean validatePhotoProof(String proof){
      if(proof.equalsIgnoreCase("pan card")){
        return true;
      }
      return false;
    }
    public boolean validateAddressProof(String proof){
      if(proof.equalsIgnoreCase("ration card")){
        return true;
      }
      return false;
    }
  }
