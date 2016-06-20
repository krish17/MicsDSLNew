package mics.dsl.service

object Data {

  case class ServiceData(name: String, description: String, packageName: String, modules: Seq[Module])
  case class ModuleData(name: String, description: String, actions: Seq[Action])
  case class ActionData(name: String, actionType: ActionType, description: String, input: Seq[Input], output: Output)
  case class InputData(name: String, description: String, inputType: String)
  case class OutputData(description: String, outputType: String)

  implicit class IServiceData(service: Service) {
    def data = service match {
      case ServiceWithModules(name, description, packageName, modules) =>
        Some(ServiceData(name, description, packageName, modules))
      case _ => None
    }
  }

  implicit class IModuleData(module: Module) {
    def data = module match {
      case ModuleWithActions(name, description, actions) =>
        Some(ModuleData(name, description, actions))
      case _ => None
    }
  }

  implicit class IActionData(action: Action) {
    def data = action match {
      case ActionWithOutput(name, actionType, description, input, output) =>
        Some(ActionData(name, actionType, description, input, output))
      case _ => None
    }
  }

  implicit class IInputData(input: Input) {
    def data = input match {
      case DescribedInput(name, inputType, description) =>
        Some(InputData(name, inputType, description))
      case _ => None
    }
  }

  implicit class IOutputData(output: Output) {
    def data = output match {
      case TypedOutput(description, outputType) =>
        Some(OutputData(description, outputType))
      case _ => None
    }
  }
}
